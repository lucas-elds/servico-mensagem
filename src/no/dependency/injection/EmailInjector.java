package no.dependency.injection;

public class EmailInjector {
    public MyApplication getEmailApp() {
        EmailService servico = new EmailService();
        return new MyApplication(servico);
    };
}
