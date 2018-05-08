/**
 * 
 */
package com.ubs.opsit.interviews;

/**
 * @author Rajendar Kumar
 *
 */
public interface IParser<T, E> {

	/**
	 * 
	 */
	public T parser(E e);

}
