package projeto_fisica;

import javax.swing.JOptionPane;

public class movimento_vertical {
	
	public static double vfc(double vo,double t){
		double g=-10;
		double v=vo+g*t;
		return v;
	}
	public static double vic(double t){
		double g=-10;
		double vo=-g*t;
		return vo;
	}
	public static double tc(double v,double vo){
		double g=-10;
		double t=(v-vo)/g;
		return t;
		
		
	}
	public static double vib(double v,double t){
		double g=10;
		double vo=v-g*t;
		return vo;
	}
	public static double vfb(double t){
		double g=10;
		double v=g*t;
		return v;
	}
	
	public static double tb(double v,double vo){
		double g=10;
		double t=(vo-v)/g;
		return t;
	}
	public static double DS(double h,double vo,double t){
		double g=10;
		double e=2;
		double hf=h+vo*t-g/2*Math.pow(t,e);
		return hf;
		
	}
	
	
	public static void main(String args[]){
	   JOptionPane.showMessageDialog(null, "Olá,vamos mostrar um exemplo de movimento vertical a seguir!");
	JOptionPane.showMessageDialog(null, "Uma bola de futebol é chutada para cima com velocidade igual a 20m/s.\n\n Calcule quanto tempo (em segundos) a bola vai demorar para retornar ao solo.Sendo: gravidade=10m/s² ");
		JOptionPane.showMessageDialog(null, "O movimento é uma combinação de um lançamento vertical para cima + um lançamento vertical para baixo,logo tem que se calcular os dois...");
		double vc=0;
		double voc=20;
		double v=20;
		double vo=0;
		double t=2;
		//JOptionPane.showMessageDialog(null, "Movimento para cima:\n\nvelocidade inicial:"+vic(t)+" m/s");
		//JOptionPane.showMessageDialog(null, "Movimento para cima:\n\nvelocidade final:"+vfc(voc,t)+" m/s");
		//JOptionPane.showMessageDialog(null, "Movimento para baixo:\n\nvelocidade final:"+vfb(t)+" m/s");
	//	JOptionPane.showMessageDialog(null, "Movimento para baixo:\n\nvelocidade inicial:"+vib(v,t)+" m/s");
		JOptionPane.showMessageDialog(null, "Movimento para cima:\n\nTempo cima:"+tc(vc,voc)+" segundos");
		JOptionPane.showMessageDialog(null, "Movimento para baixo:\n\nTempo baixo:"+tb(vo,v)+" segundos");
		JOptionPane.showMessageDialog(null,"Logo percebemos que o tempo que ela demorou para cair foi de "+(tc(vc,voc)+tb(vo,v))+" segundos");
		double vv=20;
		double h=0;
		double tt=2;
		double e=2;
		
		JOptionPane.showMessageDialog(null, "distancia:\n"+DS(h,vv,tt)+" m");
		
		
		
		int opcao=Integer.parseInt(JOptionPane.showInputDialog(null,"AGORA É SUA VEZ!!!\nVocê pretende jogar uma bola para o alto,desprezando a resistência do ar e considerando g=10m/s²\n\n O que deseja saber?\n\n1-velocidade\n2-tempo\n3-Altura"));
		if(opcao==1){
			double tempo=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tempo da bola em relação ao movimento para cima"));
			JOptionPane.showMessageDialog(null, "A velocidade da bola é de: "+vic(tempo)+ "m/s");
			
			
			
		}else if(opcao==2){
			double velocidade=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a velocidade inicial da bola em relação ao movimento para cima"));
			
			JOptionPane.showMessageDialog(null, "O tempo para a bola cair ao chão é de "+(tc(vc,velocidade)+tb(vo,velocidade)) + "seg");
			
		}else if(opcao==3){
			double alturaI=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a altura inicial.\nCaso jogue ela do chão digite 0 como altura inicial"));
			double tempo=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tempo da bola em relação ao movimento para cima"));
			double velocidade=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a velocidade inicial da bola em relação ao movimento para cima"));
			JOptionPane.showMessageDialog(null, "distancia:\n "+DS(alturaI,velocidade,tempo)+" m");
		}
		
	
	}

}
