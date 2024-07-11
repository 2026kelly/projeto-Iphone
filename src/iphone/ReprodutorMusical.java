package iphone;


public class ReprodutorMusical {

	
        private String musicaAtual;

        public void Player() {
            this.musicaAtual = "Nenhuma música";
        }
    
        public void tocarMusica(String musica) {
   		 this.musicaAtual = musica;
            System.out.println("Tocando música: " + musica);
   		
   	}
         
        public void pausarMusica() {
            System.out.println("Música pausada");
            
        }
	}

		
       
        
	