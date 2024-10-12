import java.util.List;
import java.net.SocketImpl;
import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.Scanner;
/*
Это программа создает список продуктов перед походом в магазин
*/
class Shop {
   

    // Массив типа строка, куда будет добавлен список с продуктами
    private List<String> shopList = new ArrayList<>();

    //Это переменная типа строка, в которую будет помещен название продуктами
    //прочитанная с консоли от пользователя
    private  String line;

    // Это метод, который запрашивает у пользователя название продуктами
    //и добавляет в наш список.Метод завершит свою работы только в том случае
    //когда пользователь введет слово "exit"
    public  void getShowList() {
        Scanner scanner = new Scanner(System.in);


        do {

            System.out.print("Введите название продуктов: ");
            line = scanner.nextLine();
            if(!line.equals("exit")){
                shopList.add(line);
            };
        } while (!line.equals("exit"));








    }

    // Этот метод показывет наш список на консоли
    //В дальнейшем улучшу программу, чтобы список можно было отправить на почту
    public  void showList(){

        System.out.println(shopList);
    }

    public  void delList(){
        Scanner scanner = new Scanner(System.in);
        String lineString;
        System.out.println("Выберите элемент,который хотите удалить: ");
        System.out.println(shopList);
        lineString = scanner.nextLine();
        shopList.remove(lineString);

    }
    public  void start(){
        int rezult;
        Scanner s = new Scanner(System.in);
        
        do {
            System.out.println("Введите следующие действия:");
            System.err.print("1: Создать список\n" + 
            "2: Удалить список\n" +
            "3: Показать список\n" +
            "4: Выйти из программы");
            rezult = s.nextInt();
            switch(rezult) {
                case (1): getShowList();
                break;
                case(2): delList();
                break;
                case(3): showList();
                break;





            }
        
            
            
        } while (rezult != 4);
    }


}
