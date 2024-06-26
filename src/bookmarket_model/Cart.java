package bookmarket_model;

import java.util.ArrayList;

public class Cart 
{
	private ArrayList<CartItem> itemList = new ArrayList<>();

  public boolean isEmpty() 
  {
    return itemList.isEmpty();
  }

  public ArrayList<CartItem> getItemList() 
  {
	  return itemList;
  }
  
  public void setItemList(ArrayList<CartItem> itemList) 
  {
	  this.itemList = itemList;
  }
  
  public int getNumItems() 
  {
	  return itemList.size();
  }
  
  public void setNumItems(ArrayList<CartItem> itemList) 
  {
	  this.itemList = itemList;
  }

  public String getItemInfo(int index) 
  {
	  return itemList.get(index).toString();
  }

  public void addItem(Book book) 
  {
	  CartItem item = getCartItem(book);
	  if (item == null) 
	  {
		  itemList.add(new CartItem(book));
	  } 
	  
	  else 
	  {
		  item.addQuantity(1);
	  }
  }

  private CartItem getCartItem(Book book) 
  {
    for(CartItem item : itemList)
    {
    	if(item.getBook() == book) return item;
    }
    return null;
  }

  public void resetCart() 
  {
	  itemList.clear();
  }
}

