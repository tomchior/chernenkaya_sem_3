public class ChekPoem {
        public static void main(String[] args) {
            String[] s = {"Тихой ночью, поздним летом", "Как на небе звезды рдеют", "Как под сумрачным их светом", "Нивы дремлющие зреют"};
            Poem p = new Poem(s);
            p.findRhyme();
        }
}
