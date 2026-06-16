import org.junit.Rule;
import org.junit.Test;
import static com.google.common.truth.Truth.assertWithMessage;


public abstract class TriangleTest {

    /** For autograding purposes; do not change this line. */
    abstract Triangle getNewTriangle();

    /* ***** TESTS ***** */

    // FIXME: Add additional tests for Triangle.java here that pass on a
    //  correct Triangle implementation and fail on buggy Triangle implementations.


    @Test
    public void test1() {

        Triangle t = getNewTriangle();
        // remember that you'll have to call on Triangle methods like
        // t.functionName(arguments), where t is a Triangle object

    }

    @Test
    public void testSidesFormTriangle() {
        Triangle t = getNewTriangle();
        assertWithMessage("sidesFormTriangle is wrong")
                .that(t.sidesFormTriangle(2, 3, 4)).isTrue();
        assertWithMessage("sidesFormTriangle is wrong")
                .that(t.sidesFormTriangle(1, 1, 2)).isFalse();
    }

    @Test
    public void testPointsFormTriangle() {
        Triangle t = getNewTriangle();
        assertWithMessage("pointsFormTriangle is wrong")
                .that(t.pointsFormTriangle(0, 1, 0, 0, 1, 0)).isTrue();
        assertWithMessage("pointsFormTriangle is wrong")
                .that(t.pointsFormTriangle(0, 0, 1, 0, 2, 0)).isFalse();
        assertWithMessage("pointsFormTriangle is wrong")
                .that(t.pointsFormTriangle(0, 0, 0, 1, 0, -1)).isFalse();
    }

    @Test
    public void testTriangleType() {
        Triangle t = getNewTriangle();
        assertWithMessage("triangleType is wrong")
                .that(t.triangleType(2, 3, 4)).isEqualTo("Scalene");
        assertWithMessage("triangleType is wrong")
                .that(t.triangleType(2, 2, 3)).isEqualTo("Isosceles");
        assertWithMessage("triangleType is wrong")
                .that(t.triangleType(3, 3, 3)).isEqualTo("Equilateral");
    }

    @Test
    public void testSquaredHypotenuse() {
        Triangle t = getNewTriangle();
        assertWithMessage("squaredHypotenuse is wrong")
                .that(t.squaredHypotenuse(1, 1)).isEqualTo(2);
        assertWithMessage("squaredHypotenuse is wrong")
                .that(t.squaredHypotenuse(1, 2)).isEqualTo(5);
    }

}
