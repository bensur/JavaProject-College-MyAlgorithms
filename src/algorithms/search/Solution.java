/**
 * 
 */
package algorithms.search;
import java.util.ArrayList;

/**
 * @author bensu
 *
 */
public class Solution<T> {
	protected ArrayList<State<T>> solution;
	/**
	 * C'tor
	 */
	public Solution() {
		solution = new ArrayList<State<T>>();
	}
	/**
	 * 
	 * @param s State to add
	 */
	public void add(State<T> s) {
		solution.add(s);
	}
	/*
	 * 
	 */
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (State<T> s : solution)
			sb.append(s + " ");
		return sb.toString();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((solution == null) ? 0 : solution.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Solution))
			return false;
		Solution<T> other = (Solution<T>) obj;
		if (solution == null) {
			if (other.solution != null)
				return false;
		} else if (!solution.equals(other.solution))
			return false;
		return true;
	}
	/**
	 * 
	 * @param solution2
	 */
	public void add(Solution<T> solution2) {
		for (State<T> s : solution2.solution)
			add(s);
	}
}
