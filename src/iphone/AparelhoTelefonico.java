package iphone;

	class AparelhoTelefonico {
        private String numero;
	

        public AparelhoTelefonico (String numero) {
            this.numero = numero;
        }

        public void fazerChamada() {
            System.out.println("Fazendo chamada para " + numero);
        }
    }
        