package JavaTechnoStudy.day51.tasks.task1;

public class MoneyNotEnoughException extends RuntimeException {

    public MoneyNotEnoughException(String text) {
        super(">>> " + text + " <<<");
    }


}
