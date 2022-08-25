public class Buoi1 {
    public static void main(String[] args) {
        // comment
        // 1 : Kiểu dữ liệu
        // Nhóm 1 (Nguyên thuỷ - primities): char, int, long, double, float, boolean
        // Nhóm 2 (Đối tượng - Object): String, Integer, Long, Double, Float, Boolean

        // 2: Khai báo biến tuân thủ theo camelCase
        // char a = 'a'; // char - kiểu ký tự chứa trong ''
        // int age = 28; // int, long - kiểu số nguyên (Số không có phần thập phân)
        // float height = 1.75f; // float, double - kiểu số có phần thập phân
        // boolean isMale = true; // boolean - kiểu luận lý

        // String name = "Pham Tan Phat"; // String - kieu chuoi

        // 3: Toan tu
        // int a = 5;
        // a = a + 1 <=> a += 1;
        // int b = a++;

        // Toan tu ++

        // Truong hop 1: a++
        // 1 - Truyen gia tri a vao vi tri a++
        // 2 - Tang a len 1 don vi

        // Truong hop 2: ++a
        // 1 - Tang a len 1 don vi
        // 1 - Truyen gia tri a vao vi tri a++

        // System.out.println("Gia tri cua a: " + a);
        // System.out.println("Gia tri cua b: " + b);

        // int a = 5;
        // int b = 3;

        // int result = a++ - --b + --a + a-- + b++ - b-- + a++ + --a;
        // 5 - --b + --a + a-- + b++ - b-- + a++ + --a; a = 6, b = 3;
        // 5 - 2 + --a + a-- + b++ - b-- + a++ + --a; a = 6, b = 2;
        // 5 - 2 + 5 + a-- + b++ - b-- + a++ + --a; a = 5, b = 2;
        // 5 - 2 + 5 + 5 + b++ - b-- + a++ + --a; a = 4, b = 2;
        // 5 - 2 + 5 + 5 + 2 - b-- + a++ + --a; a = 4, b = 3;
        // 5 - 2 + 5 + 5 + 2 - 3 + a++ + --a; a = 4, b = 2;
        // 5 - 2 + 5 + 5 + 2 - 3 + 4 + --a; a = 5, b = 2;
        // 5 - 2 + 5 + 5 + 2 - 3 + 4 + 4; a = 4, b = 2;
        // a = 4, b = 2, result = 20

        // System.out.println("Gia tri cua a: " + a);
        // System.out.println("Gia tri cua b: " + b);
        // System.out.println("Gia tri cua ket qua: " + result);

        // Value 1: a = 4, b = 2, result = 20 (Tich)
        // Value 2: a = 4, b = 2, result = 23 (Kevin)
        // Value 3: a = 5, b = 2, result = 17 (Tan)

        //int c = -5;
        //int d = 5;

        //int result = --c + c++ - d-- + d-- + ++c + c-- - d++ + c++ - d--;
        // -6 + c++ - d-- + d-- + ++c + c-- - d++ + c++ - d--; c = -6, d = 5;
        // -6 - 6 - d-- + d-- + ++c + c-- - d++ + c++ - d--; c = -5, d = 5;
        // -6 - 6 - 5 + d-- + ++c + c-- - d++ + c++ - d--; c = -5, d = 4;
        // -6 - 6 - 5 + 4 + ++c + c-- - d++ + c++ - d--; c = -5, d = 3;
        // -6 - 6 - 5 + 4 - 4 + c-- - d++ + c++ - d--; c = -4, d = 3;
        // -6 - 6 - 5 + 4 - 4 - 4 - d++ + c++ - d--; c = -5, d = 3;
        // -6 - 6 - 5 + 4 - 4 - 4 - 3 + c++ - d--; c = -5, d = 4;
        // -6 - 6 - 5 + 4 - 4 - 4 - 3 - 5 - d--; c = -4, d = 4;
        // -6 - 6 - 5 + 4 - 4 - 4 - 3 - 5 - 4; c = -4, d = 3;
        // c = -4, d = 3, result = -33

        // Độ ưu tiên
        // ++ --
        // * /
        // + -

        // System.out.println("Gia tri cua a: " + c);
        // System.out.println("Gia tri cua x: " + d);
        // System.out.println("Gia tri cua ket qua: " + result);

        // int a = 5;
        // int b = a / 3;
        // System.out.print(b);

        // "/" Chia lấy phần nguyên
        // "%" chia lấy phần dư
        // Toán tử so sánh : >, <, ==

        // 4: Câu điều kiện

        // int a = 5;
        // int b = 10;

        // Trường hợp sẽ xảy ra thì phải làm gì   }

        // Ngoặc tròn "()" dùng để chứa giá trị
        // Ngoặc nhọn "{}" dùng để chứa đoạn lệnh

        // if (a > b) {
        // System.out.print("A lớn hơn B");
        //} else if (a < b) {
        // System.out.print("A bé hơn B");
        // } else {
        // System.out.print("A bằng B");

        // "+" + value = avalue (kết nối chuỗi)
        // }


//        String ANSI_RESET, ANSI_GREEN, ANSI_YELLOW, ANSI_BLUE;
//        ANSI_RESET = "\u001B[0m";
//        ANSI_GREEN = "\u001B[32m";
//        ANSI_YELLOW = "\u001B[33m";
//        ANSI_BLUE = "\u001B[34m";
//        // color code
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(ANSI_BLUE + "Mời bạn nhập cân nặng (kg): " + ANSI_RESET);
//        float weight = scanner.nextFloat();
//        // input weight
//
//        System.out.print(ANSI_BLUE + "Mời bạn nhập chiều cao (x.xx mét): " + ANSI_RESET);
//        float height = scanner.nextFloat();
//        // input height
//
//        System.out.print(ANSI_BLUE + "Cân nặng của bạn là " + weight + "KG" + ANSI_RESET);
//        System.out.print(ANSI_BLUE + " Chiều cao của bạn là " + height + "M" + ANSI_RESET);
//        float result = (weight / (height * height));
//        // BMI calculate
//
//        System.out.print(ANSI_BLUE + " Chỉ số BMI của bạn là " + Math.ceil(result * 100.0f) / 100.0f + ANSI_RESET);
//        // BMI report after calculate
//
//        float minLevel1 = 18.5f;
//        float minLevel2 = 24.9f;
//        float minLevel3 = 29.9f;
//        float minLevel4 = 34.9f;
//        float minLevel5 = 39.9f;
//        float minLevel6 = 40.0f;
//        // varible report
//
//        if (result < minLevel1) {
//            System.out.print(ANSI_GREEN + " Bạn đang ở mức Ốm, Nguy cơ phát triển bệnh của bạn ở mức độ THẤP " + ANSI_RESET);
//        }
//        else if (result < minLevel2) {
//            System.out.print(ANSI_GREEN + " Bạn đang ở mức Cân Đối, Nguy cơ phát triển bệnh của bạn ở mức độ TRUNG BÌNH " + ANSI_RESET);
//        }
//        else if (result < minLevel3) {
//            System.out.print(ANSI_YELLOW + " Bạn đang ở mức Hơi Béo, Nguy cơ phát triển bệnh của bạn ở mức độ Cao " + ANSI_RESET);
//        }
//        else if  (result < minLevel4) {
//            System.out.print(ANSI_YELLOW +" Bạn đang ở mức Béo Phì cấp độ 1, Nguy cơ phát triển bệnh của bạn ở mức độ Cao " + ANSI_RESET);
//        }
//        else if  (result < minLevel5) {
//            System.out.print(ANSI_YELLOW + " Bạn đang ở mức Béo Phì cấp độ 2, Nguy cơ phát triển bệnh của bạn ở mức độ Rất Cao " + ANSI_RESET);
//        }
//        else if (result > minLevel6)
//            System.err.println(" Bạn đang ở mức Béo Phì cấp độ 3, Nguy cơ phát triển bệnh của bạn ở mức độ Nguy Hiểm ");
        // Hello

        // 5: Câu điều kiện switch case

//        int month = 6;
//
//        switch (month) {
//            case 1:
//                System.out.println("Quý 1");
//                break;
//            case 2:
//                System.out.println("Quý 2");
//                break;
//            case 3:
//                System.out.println("Quý 3");
//                break;

//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Quý 3");
//                break; }

        // 5: Mảng
        // Array = chỉ được lưu không được xóa thêm ( nhược điểm: tât cả lưu tại 1 nơi)
        // Collection = Không tập trung 1 nơi ( Có thẻe thêm xóa sửa )

        // Array cách 1: Tạo ra và truyền các phần tử cho mảng
        // String[] arrNames = {"Tân", "Hào", "Hiệp", "Tiến", "Minh"};

        // Lấy kích thước của mảng
        // System.out.print("Kích thước của mảng là " + arrNames.length);

        // Lấy giá trị phần tử theo index
        // Vị trí đầu tiên sẽ có index = 0
        // Vị trí cuối sẽ là length - 1
        // System.out.print(arrNames[1]);


        // chỉnh sửa value
        // arrNames[1] = "Tân Hoàng Minh";
        // System.out.print(arrNames[1]);

        // Array cách 2: Tạo ra mảng nhưng chỉ biết số lượng
        // String[] arrNames = new String[10];

        // 6: Vòng lặp for

        // for (int i = 1; i <= 100; i++) {
            // if(i % 2 == 0)
                // System.out.println(i + " Đây là số chẵn!");

        int[] arrNumbers = {2,3,4,5,6,10,1,20,30,15,16,17,18,21,22,23};
        // Các mảng phân tử

        int min = arrNumbers[0];
        int max = arrNumbers[0];
        // Gán giá trị nhỏ và lớn nhất vào min và max

        for (int i = 0; i < arrNumbers.length; i++){
            if(arrNumbers[i] < min){min = arrNumbers[i];
            }
            // Nếu có giá trị nhỏ hơn min sẽ gán giá trị đó vào min

            if(arrNumbers[i] > max){max = arrNumbers[i];
            }
            // Nếu có giá trị lớn hơn max sẽ gán giá trị đó vào max
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
        System.out.println("Giá trị nhỏ nhất là: " + max);

        //Done
        }
    }
