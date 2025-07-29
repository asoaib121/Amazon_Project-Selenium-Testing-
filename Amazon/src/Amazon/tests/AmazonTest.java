package Amazon.tests;

import Amazon.Enums.CategoryType;
import Amazon.annotations.FrameworkAnnotation;
import Amazon.pages.AmazonHomePage;
import Amazon.reports.ExtentManager;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import java.util.Map;
import java.util.Objects;

public final class AmazonTest extends BaseTest {


    private AmazonTest() {}

    @FrameworkAnnotation(author={"Amuthan","Sachin"},category={CategoryType.REGRESSION,CategoryType.MINIREGRESSION})
    @Test
    public void  amazonTest(Map<String,String>data) {//Amuthan,Sachin
        ExtentManager.getExtentTest().assignAuthor("Amuthan").assignAuthor("Sachin")
                .assignCategory("Smoke").assignCategory("Regression");

        try {
            String title = Objects.requireNonNull(new AmazonHomePage().clickHamburger()
                    .clickComputer()
                    .clickOnSubMenuItem(data.get("menutext"))).getTitle();
            Assertions.assertThat(title).isNotNull().isNotBlank();
        }catch(Exception e){
            System.out.println("Test failed with exception: " + e.getMessage());
            throw e;
        }
    }
}