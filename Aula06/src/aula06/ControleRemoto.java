package aula06;

public class ControleRemoto implements Controlador{


		//atributos		
		private int volume;
		private boolean ligado;
		private boolean tocando;
		
		//Métodos Especiais

		public ControleRemoto() {
			this.volume = 50;
			this.ligado = false;
			this.tocando= false;
		}

		
		public int getVolume(){
			return volume;
		}
		
		public void setVolume(int volume) {
			this.volume = volume;
		}

		public boolean getLigado() {
			return ligado;
		}

		public void setLigado(boolean ligado) {
			this.ligado = ligado;
		}

		public boolean getTocando() {
			return tocando;
		}

		public void setTocando(boolean tocando) {
			this.tocando = tocando;
		}

		//Métodos Abstratos
		@Override
		public void ligar() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void desligar() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void abrirMenu() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void fecharMenu() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void maisVolume() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void menosVolume() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void ligarMudo() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void desligarMudo() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void play() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void pause() {
			// TODO Auto-generated method stub
			
		}
		
	}


