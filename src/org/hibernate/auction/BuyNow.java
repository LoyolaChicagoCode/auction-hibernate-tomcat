//$Id: BuyNow.java,v 1.1 2005-03-19 01:28:35 laufer Exp $
package org.hibernate.auction;

/**
 * @author Gavin King
 */
public class BuyNow extends Bid {
	public boolean isBuyNow() {
		return true;
	}
	public String toString() {
		return super.toString() + " (buy now)";
	}
}
