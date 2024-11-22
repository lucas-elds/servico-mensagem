package no.dependency.injection;

public class ClientTest {
    public static void main(String[] args) {
        MyApplication app;

        // Criando uma aplicação de E-mail:
        EmailInjector injetorEmail = new EmailInjector();
        app = injetorEmail.getEmailApp();
        app.processarMensagem("Mensagem por E-mail.", "alex@ifpb.edu.br");

        // Criando uma aplicação de SMS:
        SmsInjector injetorSms = new SmsInjector();
        app = injetorSms.getSmsApp();
        app.processarMensagem("Mensagem por SMS.", "alex@ifpb.edu.br");

    }
}
