/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solvelinearsystem;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

/**
 *
 * @author Luke Chang
 */
public class SolveLinearSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // solving linear system using matrix
        // link http://commons.apache.org/proper/commons-math/userguide/linear.html
        // 2x + 3y - 2z = 1
        // -x + 7y + 6x = -2
        // 4x - 3y - 5z = 1

        RealMatrix coefficients = new Array2DRowRealMatrix(new double[][]{{2, 3, -2}, {-1, 7, 6}, {4, -3, -5}}, false);
        DecompositionSolver solver = new LUDecomposition(coefficients).getSolver();
        RealVector constants = new ArrayRealVector(new double[]{1, -2, 1}, false);
        RealVector solution = solver.solve(constants);

        System.out.println(solution.toString());
    }

}
