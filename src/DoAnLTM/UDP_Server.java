package DoAnLTM;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class UDP_Server {

    private static Scanner in;
    private static String noiDung;
    private static String mappedKey;

    public static void main(String[] args) throws SocketException, IOException {
        //Server tạo Socket - gán số hiệu cổng
        DatagramSocket server = new DatagramSocket(8888);
        System.out.println("Server đã chạy!!! đợi nhận thông tin");
        while (true) {
            byte nhanson[] = new byte[1024];
            DatagramPacket repacket = new DatagramPacket(nhanson, nhanson.length);
            server.receive(repacket);
            String chuoiYeuCau = new String(repacket.getData(), 0, repacket.getLength()).trim();

            Scanner sc = new Scanner(chuoiYeuCau);
            sc.useDelimiter("@");
            int luaChon = sc.nextInt();
            String tapTin = sc.next();
            noiDung = sc.next();
            String fileName = "C:\\Users\\Admin\\Desktop\\" + tapTin + ".txt";

            if (luaChon == 1) {
                // Ghi File văn bản
                try {
                    System.out.println("---Encryption---");
                    MappingKey();
                    String encryptedText = cipherEncryption(noiDung, mappedKey);

                    FileWriter fw = new FileWriter(new File(fileName));
                    fw.write(encryptedText);
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                MappingKey();
                String encryptedText = cipherEncryption(noiDung, mappedKey);
                byte a[] = new byte[1024];
                File file;
                int i;
                char s[] = encryptedText.toCharArray();
                for (i = 0; i < s.length; i++) {
                    a[i] = (byte) s[i];
                }
                try {
                    file = new File(fileName);
                    FileOutputStream fo = new FileOutputStream(file);
                    fo.write(a);
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }//if-else
            String strTest = "";
            // Đọc File
            if (luaChon == 1) {
                // Đọc File văn bản
                try {
                    FileReader fr = new FileReader(new File(fileName));
                    StringBuffer sb = new StringBuffer();
                    char ca[] = new char[5];// đọc mỗi lần 5 ký tự 
                    while (fr.ready()) {
                        int len = fr.read(ca);
                        sb.append(ca, 0, len);
                    }
                    String noiDungstr = String.valueOf(sb);
                    strTest = cipherDecryption(noiDungstr, mappedKey);
                    System.out.println("Giải mã (văn bản): " + strTest);
                    fr.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                byte a[];
                File file;
                try {
                    file = new File(fileName);
                    FileInputStream fi = new FileInputStream(file);
                    a = new byte[fi.available()];
                    fi.read(a);
                    fi.close();
                    String noiDungstr = new String(a);
                    strTest = cipherDecryption(noiDungstr.trim(), mappedKey);
                    System.out.println("Giải mã (nhị phân): "+strTest);
                } catch (IOException ex) {
                }
            }
            //tìm vị trí hello
            String timHello = findHello(strTest);
            if(timHello.isEmpty())
                timHello = "Không tìm thấy từ hello nào trong tập tin : "+tapTin;
            //trả về client
            byte send[] = new byte[1024];
            send = timHello.getBytes();
            InetAddress ip = repacket.getAddress();
            int port = repacket.getPort();
            DatagramPacket KetQua = new DatagramPacket(send, send.length, ip, port);
            server.send(KetQua);
        }
    }
    // hàm giải mã
    private static String cipherDecryption(String message, String mappedKey) {
        int[][] table = createVigenereTable();
        String decryptedText = "";

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == (char) 32 && mappedKey.charAt(i) == (char) 32) {
                decryptedText += " ";
            } else {
                decryptedText += (char) (65 + itrCount((int) mappedKey.charAt(i), (int) message.charAt(i)));
            }
        }
        //System.out.println("Encrypted Text: " + decryptedText); 
        return decryptedText;
    }
    //hàm mã hóa
    private static String cipherEncryption(String message, String mappedKey) {
        int[][] table = createVigenereTable();
        String encryptedText = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == (char) 32 && mappedKey.charAt(i) == (char) 32) {
                encryptedText += " ";
            } else {
                encryptedText += (char) table[(int) message.charAt(i) - 65][(int) mappedKey.charAt(i) - 65];
            }
        }
        //System.out.println("Encrypted Text: " + encryptedText); 
        return encryptedText;
    }
    // Tạo bảng 2 chiều vigenere
    private static int[][] createVigenereTable() {
        int[][] tableArr = new int[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                int temp;
                if ((i + 65) + j > 90) {//65: A, 90:Z
                    temp = ((i + 65) + j) - 26;
                    tableArr[i][j] = temp;
                } else {
                    temp = (i + 65) + j;
                    tableArr[i][j] = temp;
                }
            }
        }
        return tableArr;
    }
    // hàm nhập khóa
    private static void MappingKey() {
        System.out.println("Nhập khóa: ");
        in = new Scanner(System.in);
        String key = in.nextLine();
        key = key.toUpperCase();

        noiDung = noiDung.toUpperCase();

        String keyMap = "";
        for (int i = 0, j = 0; i < noiDung.length(); i++) {
            if (noiDung.charAt(i) == (char) 32) {

                keyMap += (char) 32;

            } else {

                if (j < key.length()) {
                    keyMap += key.charAt(j);
                    j++;
                } else {
                    j = 0;
                    keyMap += key.charAt(j);
                    j++;

                }
            }
        }
        mappedKey = keyMap;
    }
    // Đếm thứ tự từ khóa đến từ mã hóa
    private static int itrCount(int key, int msg) {
        int counter = 0;
        String result = "";
        for (int i = 0; i < 26; i++) {
            if (key + i > 90) {
                result += (char) (key + (i - 26));

            } else {
                result += (char) (key + i);
            }
        }

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == msg) {
                break;
            } else {
                counter++;
            }
        }
        return counter;
    }

    // Tìm vị trí Hello
    public static String findHello(String msg) {
        String ketQua="";
        String Str = msg.toUpperCase();
        String findWord = "Hello";
        findWord = findWord.toUpperCase();
        String reverseWord = "";
        for (int i = (findWord.length() - 1); i >= 0; i--) {
            reverseWord += findWord.charAt(i);
        }
        int vt = 0;
        while (vt != -1) {
            vt = Str.indexOf(findWord);
            if (vt != -1) {
                Str = Str.replaceFirst(findWord, reverseWord);
                ketQua+="Tìm thấy từ hello tại vị trí:  "+vt+"\n";//12@34
                System.out.println("Tim thấy từ " + findWord + " ở vị trí " + vt);
            }
        }//while
        return ketQua;
    }

}
