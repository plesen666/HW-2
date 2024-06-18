public class Main {
    public static void main(String[] args) {

        var hours = 640;
        var staff = hours/8;


      System.out.println("Всего работников в компании — " +staff+" человек");

        var staffNew= staff+94;
        System.out.println("Если в компании работает " + staffNew + " человек, то всего " + hours /staffNew + " часа работы может быть поделено между сотрудниками");
    }}