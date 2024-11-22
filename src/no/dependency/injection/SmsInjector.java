package no.dependency.injection;

public class SmsInjector {
    public MyApplication getSmsApp() {
        SmsService servico = new SmsService();
        return new MyApplication(servico);
    };
}
