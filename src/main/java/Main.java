public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.passport = "9999 99999999";
        post.phone = "+7 (999)-999-99-99";
        post.patronymic = "Иванович";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 1985;
    }
}
