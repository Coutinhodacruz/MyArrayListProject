package queue;

public class PregnanantWoman <E>{

    public static void main(String[] args) {
        PregnantWomenQueue<Integer> pregnantWomenQueue = new PregnantWomenQueue<>();

        pregnantWomenQueue.addOnePregnantWoman(1);
        pregnantWomenQueue.addOnePregnantWoman(2);
        pregnantWomenQueue.addOnePregnantWoman(3);
        pregnantWomenQueue.addOnePregnantWoman(4);
        pregnantWomenQueue.addOnePregnantWoman(5);

        pregnantWomenQueue.remove();
        pregnantWomenQueue.remove();

        System.out.println(pregnantWomenQueue);
    }
}
