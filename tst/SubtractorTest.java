public class SubtractorTest {
   public void testSubtract() {
     Subtractor subtraction = new Subtractor();
     int result = subtraction.subtract(4,1);
     assert(result==3);
   }
}
