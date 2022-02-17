	private static int obtenerEntero() {
		boolean valNoOK = true;
		int n = 0;;
		
		while(valNoOK) {
			try {
				System.out.println("Introduce el entero: ");
				n = Integer.parseInt(sc.nextLine());
				
				if(n >= 0) {
					valNoOK = false;
				
				}else {
					throw new Exception("El valor nos es valido, debe ser un numero superior o igual a 0");
				}
				
			}catch (NumberFormatException e) {
				System.out.println("El valor introducido no es valido debe ser un valor entero");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return n;
	}