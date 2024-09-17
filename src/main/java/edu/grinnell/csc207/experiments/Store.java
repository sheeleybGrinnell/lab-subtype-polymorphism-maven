package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.store.Item;
import edu.grinnell.csc207.store.BulkItem;
import edu.grinnell.csc207.store.Multiple;
import edu.grinnell.csc207.store.Purchase;
import edu.grinnell.csc207.store.StoreUtils;

import java.io.PrintWriter;

/**
 * Some experiments with our store classes.
 *
 * @author Samuel A. Rebelsky
 * @author Ben Sheeley, Leo Goldman
 */
public class Store {
  /**
   * Run the experiments.
   *
   * @param args
   *   Command-line arguments.
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    StoreUtils.printReceipt(pen,
        new Purchase[] {
          new Item("hammer", "hits things", 899),
          new Item("penny candy", "imaginary", 1),
          new Item("Sickle", "little scythe", 3000),
          new BulkItem("saffron", "yellow", "gram", 1111, 2),
          new Multiple("nail", "sharp", 2, 63)
        });
    pen.close();
  } // main(String[])
} // class Store
