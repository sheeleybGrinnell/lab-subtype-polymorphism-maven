package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.store.Item;
import edu.grinnell.csc207.store.BulkItem;
import edu.grinnell.csc207.store.Purchase;
import edu.grinnell.csc207.store.StoreUtils;

import java.io.PrintWriter;

/**
 * Some experiments with our store classes.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
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
        });
    pen.close();
  } // main(String[])
} // class Store
