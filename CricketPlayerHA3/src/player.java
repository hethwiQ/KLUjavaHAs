public interface player {
    public void play();
}
class Cricket implements player{
    @Override
    public void play() {
        System.out.println("Cricket Player");
    }
}
