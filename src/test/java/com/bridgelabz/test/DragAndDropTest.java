package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.utils.DragAndDrop;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class DragAndDropTest extends Base {
    @Severity(SeverityLevel.NORMAL)
    @Description("Dragging and Dropping the element")
    @Test
    public static void drag_and_drop_the_element() throws InterruptedException {
        DragAndDrop dragAndDrop = new DragAndDrop(driver);
        dragAndDrop.dragAndDrop();
    }
}
