package clases;
/**
 * Un enumerado (o Enum) es una clase "especial" (tanto en Java como en otros
*	lenguajes) que limitan la creación de objetos a los especificados
*	explícitamente en la implementación de la clase. La única limitación que
*	tienen los enumerados respecto a una clase normal es que si tiene
*	constructor, este debe de ser privado para que no se puedan crear nuevos
*	objetos.
 * @see pag 208 Aprende a programar con Java, JIMENEZ MARIN, A. y otros. Ed PARANINFO*
 */


public enum Tipo_Autor {

	
	NARRATIVA, LIRICA, DRAMATICA, POESIA, TEATRO, ANTOLOGIA, OTROS;

}
