public class App {
    public static void main(String[] args) {
        Author esenin = new Author("Sergey", "Esenin");
        Author tolstoy = new Author("Lev", "Tolstoy");
        Book voinaIMir = new Book("VoinaIMir", tolstoy, 1860);
        Book pismoKJenjene = new Book("PismoKJenjene", esenin, 2012);
        voinaIMir.setYearOfPublishing(1867);
        System.out.println(voinaIMir);
        System.out.println(pismoKJenjene);
        System.out.println();
        System.out.println();
    }

}