public class NumberPartitionRunner{

  public static void main(String[] args) {
    NumberPartition np = new NumberPartition();

    np.buildDPTable(7,7);
    np.printDPTable();
    System.out.println(np.getNumberOfPartitions(6,5));
  }

}
