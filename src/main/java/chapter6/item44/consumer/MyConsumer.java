package chapter6.item44.consumer;

@FunctionalInterface
interface MyConsumer {
    void accept(String txt);
}