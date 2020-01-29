/**
 * Clase para manejar las entradas de un blog.
 * @since 29/01/2020
 * @author  Jordi Codevila de Le�n
 * @version 2.4
 *
 */
public class entradablogjcl{
	//separador es el ccar�cter que separa ENTRADA DE del
	//nombre del autor
	
	private static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	
	/**
	 * Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
	 *	de la entrada y el texto que contiene la entrada. Si el n�mero de entrada
	 *	es negativo, lanza una excepci�n.
	 * @param id
	 * @param autor
	 * @param texto
	 * @throws IllegalArgumentException
	 */
	public entradablogjcl(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * @return el n�mero de la entrada
	 */
	public int getId(){
		return this.id;
		
	}
	
	/**
	 * @return el texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	
	/**
	 * @return el nombre del autor de la entrada en may�sculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	
	/**
	 * @return el nombre del autor. Ya no se usa. Mejor ver getAutor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	

	/**
	 * @param args No tiene porqu� tener argumentos.
	 */
	public static void main(String[] args) {
                //Modificar.
		entradablogjcl e1=new entradablogjcl (-3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}
	/**
	 * @return el separador
	 */
	public static char getSeparador() {
		return separador;
	}
	/**
	 * @param separador
	 */
	public static void setSeparador(char separador) {
		entradablogjcl.separador = separador;
	}
}