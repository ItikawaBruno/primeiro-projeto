package fiap;

import java.util.Scanner;

public class exe_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e= new Scanner(System.in);
		
		int pe=0, total=0, qtdProdutos=0, codigo=0 ;
		String cp="Sim";
		double condicao=0;
		
		
		
		
		
		while(cp.equalsIgnoreCase("Sim")) {
			
		
		System.out.println("Digite o preco da etiqueta:");
		pe=e.nextInt();	
			
		while(pe!=0) {
			
			total+=pe;
			
			qtdProdutos++;
		
			
			System.out.println("Digite o preço da etiqueta:");
			pe=e.nextInt();
			
			
			}
		
		
		
		System.out.println("Digite a condição de pagamento:");
		codigo=e.nextInt();
		while(condicao<4) {
		if(codigo==1) {
			System.out.println("Pagamento com 10% de desconto:"+(total*0.90));
		}else if(codigo==2) {
		
			System.out.println("Pagamento com 5% de desconto:"+(total*0.95));
		}else if(codigo==3) {
			
			System.out.println("Pagamento em 2X sem juros:"+(total/2));
		}else if(codigo==4) {
			
			System.out.println("Pagamento em 3X com acréscimo de 10%"+(total/3)+(total*1.10));
		}else {
			System.out.println("Digite o condição correta");
			condicao=e.hashCode();
			
		}
		
		
		
		}
		
		
		
			
		}
		System.out.println("Deseja inserir nova compra:");
		cp=e.next().toUpperCase().charAt(0).
		
		
		
		

	}

}
