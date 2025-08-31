public class AdjacencyMatrix {
    public static void main(String[] args) {
        int nodes = 4;
        int[][] matrix = new int[nodes][nodes];

        // Edges: 0-1, 0-3, 2-1
        matrix[0][1] = 1;
        matrix[1][0] = 1;

        matrix[0][3] = 1;
        matrix[3][0] = 1;

        matrix[2][1] = 1;
        matrix[1][2] = 1;

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
