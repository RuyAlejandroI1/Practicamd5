package contraseñas;

public class BaseDeDatos {
		
		public Usuarios[] usuariosRegistrados = new Usuarios[5];
		public BaseDeDatos() {
			
		usuariosRegistrados[0]= new Usuarios("juan","e10adc3949ba59abbe56e057f20f883e");//123456
		usuariosRegistrados[1]= new Usuarios("sofia","e80b5017098950fc58aad83c8c14978e");//abcdef
		usuariosRegistrados[2]= new Usuarios("antonio","5f4dcc3b5aa765d61d8327deb882cf99");//password
		usuariosRegistrados[3]= new Usuarios("luisa","89c79702b411a0b89ccf8f8e01590f0c");//19051980
		usuariosRegistrados[4]= new Usuarios("jorge","17df4f8c0f4182b650ec83355b33d796");//J0rg3
		}
	}

