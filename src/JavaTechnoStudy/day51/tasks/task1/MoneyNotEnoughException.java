package JavaTechnoStudy.day51.tasks.task1;

public class MoneyNotEnoughException extends RuntimeException {  // unchecked exception

    public MoneyNotEnoughException(String text) {

        super(">>> " + text + " <<<");
    }

    /*  bura bizim custom exception oluyor,
        her class in kendine gore kurallari oluyo,
        bunu da biz kendimiz olusturduk



        RunTime yerine MoneyNotEnough adini biz verdik sonra
        ustune gelip sag tikladik ve super class olusturduk

        parent of exception is Throwable
     */

}
