package app;

public class Menu {
	{
	int opcao = 0;
	
	Notification notificacao = new Notification();
	
	do{
		notificacao.alert();
		System.out.println("Bem vindo ao sistema!"); 
		System.out.println("1 - Login\n" 
							+"2 - Cadastrar\n"
							 + "3 - Lista de eventos\n");
		
		
		switch(opcao) {
		case 1:
			System.out.println("1 - Cadastrar Eventos\n " 
								+ "2 - Consultar Eventos\n"
								+ "3 - ");
			
			break;
		case 2: 
	
			
			break;
		case 3:
			
			break;
			
		}
	}while(opcao != 0);

}}
