package metube.mncplaymedia.com.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_test{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pmain").vw.setLeft((int)(0-(65d / 100 * width)));
views.get("pmain").vw.setWidth((int)((100d / 100 * width) - (0-(65d / 100 * width))));
views.get("pmain").vw.setTop((int)(0d));
views.get("pmain").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("paction").vw.setHeight((int)((11d / 100 * height)));
views.get("paction").vw.setTop((int)(0d));
views.get("svdaftarisi").vw.setTop((int)((views.get("pcoverflow").vw.getTop() + views.get("pcoverflow").vw.getHeight())));
views.get("svdaftarisi").vw.setHeight((int)((100d / 100 * height) - ((views.get("pcoverflow").vw.getTop() + views.get("pcoverflow").vw.getHeight()))));
views.get("ivmenu").vw.setLeft((int)((4d / 100 * width)));
views.get("ivmenu").vw.setWidth((int)(((views.get("paction").vw.getHeight())/2.2d)+(4d / 100 * width) - ((4d / 100 * width))));
views.get("ivmenu").vw.setTop((int)(0d));
views.get("ivmenu").vw.setHeight((int)((views.get("paction").vw.getHeight())/2.2d - (0d)));
views.get("ivmenu").vw.setTop((int)((views.get("paction").vw.getHeight())/2d - (views.get("ivmenu").vw.getHeight() / 2)));
views.get("ivmetube").vw.setLeft((int)((views.get("ivmenu").vw.getLeft() + views.get("ivmenu").vw.getWidth())+(20d / 100 * width)));
views.get("ivmetube").vw.setWidth((int)((views.get("ivsearch").vw.getLeft())-(15d / 100 * width) - ((views.get("ivmenu").vw.getLeft() + views.get("ivmenu").vw.getWidth())+(20d / 100 * width))));
views.get("ivmetube").vw.setTop((int)((2d / 100 * height)));
views.get("ivmetube").vw.setHeight((int)((9d / 100 * height) - ((2d / 100 * height))));
views.get("pmenukiri").vw.setTop((int)(0d));
views.get("pmenukiri").vw.setHeight((int)((views.get("pmain").vw.getHeight()) - (0d)));
views.get("pmenukiri").vw.setLeft((int)(0d));
views.get("pmenukiri").vw.setWidth((int)((65d / 100 * width) - (0d)));
views.get("patas").vw.setLeft((int)(0d));
views.get("patas").vw.setWidth((int)((65d / 100 * width) - (0d)));
views.get("patas").vw.setTop((int)(0d));
views.get("patas").vw.setHeight((int)((11d / 100 * height) - (0d)));
views.get("ivclose").vw.setLeft((int)((2d / 100 * width)));
views.get("ivclose").vw.setWidth((int)((10d / 100 * width) - ((2d / 100 * width))));
views.get("ivclose").vw.setTop((int)((3d / 100 * height)));
views.get("ivclose").vw.setHeight((int)((8d / 100 * height) - ((3d / 100 * height))));
views.get("ivsetting").vw.setLeft((int)((55d / 100 * width)));
views.get("ivsetting").vw.setWidth((int)((63d / 100 * width) - ((55d / 100 * width))));
views.get("ivsetting").vw.setTop((int)((3d / 100 * height)));
views.get("ivsetting").vw.setHeight((int)((8d / 100 * height) - ((3d / 100 * height))));
views.get("lblsignup").vw.setLeft((int)(0d));
views.get("lblsignup").vw.setWidth((int)((views.get("pmenukiri").vw.getWidth()) - (0d)));
views.get("lblsignup").vw.setTop((int)((views.get("patas").vw.getTop() + views.get("patas").vw.getHeight())+(1d / 100 * height)));
views.get("lblsignup").vw.setHeight((int)((16d / 100 * height) - ((views.get("patas").vw.getTop() + views.get("patas").vw.getHeight())+(1d / 100 * height))));
views.get("ivgaris").vw.setLeft((int)(0d));
views.get("ivgaris").vw.setWidth((int)((views.get("pmenukiri").vw.getWidth()) - (0d)));
views.get("ivgaris").vw.setTop((int)((views.get("lblsignup").vw.getTop() + views.get("lblsignup").vw.getHeight())));
views.get("ivgaris").vw.setHeight((int)((20d / 100 * height) - ((views.get("lblsignup").vw.getTop() + views.get("lblsignup").vw.getHeight()))));
views.get("plist").vw.setLeft((int)(0d));
views.get("plist").vw.setWidth((int)((views.get("pmenukiri").vw.getWidth()) - (0d)));
views.get("plist").vw.setTop((int)((views.get("ivgaris").vw.getTop() + views.get("ivgaris").vw.getHeight())));
views.get("plist").vw.setHeight((int)((views.get("pmenukiri").vw.getHeight()) - ((views.get("ivgaris").vw.getTop() + views.get("ivgaris").vw.getHeight()))));
views.get("lblcontoh").vw.setLeft((int)((2d / 100 * width)));
views.get("lblcontoh").vw.setWidth((int)((views.get("plist").vw.getWidth()) - ((2d / 100 * width))));
views.get("lblcontoh").vw.setTop((int)(0d));
views.get("lblcontoh").vw.setHeight((int)((6d / 100 * height) - (0d)));
views.get("lvmenukiri").vw.setTop((int)((views.get("lblcontoh").vw.getTop() + views.get("lblcontoh").vw.getHeight())));
views.get("lvmenukiri").vw.setHeight((int)((25d / 100 * height) - ((views.get("lblcontoh").vw.getTop() + views.get("lblcontoh").vw.getHeight()))));
views.get("lvmenukiri").vw.setLeft((int)((views.get("lblcontoh").vw.getLeft())));
views.get("lvmenukiri").vw.setWidth((int)((views.get("pmenukiri").vw.getLeft() + views.get("pmenukiri").vw.getWidth()) - ((views.get("lblcontoh").vw.getLeft()))));
views.get("lblcoba").vw.setLeft((int)((2d / 100 * width)));
views.get("lblcoba").vw.setWidth((int)((views.get("plist").vw.getWidth()) - ((2d / 100 * width))));
views.get("lblcoba").vw.setTop((int)((views.get("lvmenukiri").vw.getTop() + views.get("lvmenukiri").vw.getHeight())));
views.get("lblcoba").vw.setHeight((int)((30d / 100 * height) - ((views.get("lvmenukiri").vw.getTop() + views.get("lvmenukiri").vw.getHeight()))));
views.get("lvbrowse").vw.setLeft((int)((views.get("lblcoba").vw.getLeft())));
views.get("lvbrowse").vw.setWidth((int)((views.get("pmenukiri").vw.getLeft() + views.get("pmenukiri").vw.getWidth()) - ((views.get("lblcoba").vw.getLeft()))));
views.get("lvbrowse").vw.setTop((int)((views.get("lblcoba").vw.getTop() + views.get("lblcoba").vw.getHeight())));
views.get("lvbrowse").vw.setHeight((int)((42d / 100 * height) - ((views.get("lblcoba").vw.getTop() + views.get("lblcoba").vw.getHeight()))));
views.get("lblcate").vw.setLeft((int)((2d / 100 * width)));
views.get("lblcate").vw.setWidth((int)((views.get("plist").vw.getWidth()) - ((2d / 100 * width))));
views.get("lblcate").vw.setTop((int)((views.get("lvbrowse").vw.getTop() + views.get("lvbrowse").vw.getHeight())));
views.get("lblcate").vw.setHeight((int)((48d / 100 * height) - ((views.get("lvbrowse").vw.getTop() + views.get("lvbrowse").vw.getHeight()))));
views.get("lvcate").vw.setLeft((int)((views.get("lblcate").vw.getLeft())));
views.get("lvcate").vw.setWidth((int)((views.get("lblcate").vw.getLeft() + views.get("lblcate").vw.getWidth()) - ((views.get("lblcate").vw.getLeft()))));
views.get("lvcate").vw.setTop((int)((views.get("lblcate").vw.getTop() + views.get("lblcate").vw.getHeight())));
views.get("lvcate").vw.setHeight((int)((90d / 100 * height) - ((views.get("lblcate").vw.getTop() + views.get("lblcate").vw.getHeight()))));
views.get("paction").vw.setLeft((int)((views.get("pmenukiri").vw.getLeft() + views.get("pmenukiri").vw.getWidth())));
views.get("paction").vw.setWidth((int)((views.get("pmain").vw.getWidth()) - ((views.get("pmenukiri").vw.getLeft() + views.get("pmenukiri").vw.getWidth()))));
views.get("svdaftarisi").vw.setLeft((int)((views.get("pmenukiri").vw.getLeft() + views.get("pmenukiri").vw.getWidth())));
views.get("svdaftarisi").vw.setWidth((int)((views.get("pmain").vw.getWidth()) - ((views.get("pmenukiri").vw.getLeft() + views.get("pmenukiri").vw.getWidth()))));
views.get("svdaftarisi").vw.setTop((int)((50d / 100 * height)));
views.get("svdaftarisi").vw.setHeight((int)((100d / 100 * height) - ((50d / 100 * height))));
views.get("pcoverflow").vw.setLeft((int)((views.get("pmenukiri").vw.getLeft() + views.get("pmenukiri").vw.getWidth())));
views.get("pcoverflow").vw.setWidth((int)((views.get("pmain").vw.getWidth()) - ((views.get("pmenukiri").vw.getLeft() + views.get("pmenukiri").vw.getWidth()))));
views.get("pcoverflow").vw.setTop((int)((views.get("paction").vw.getTop() + views.get("paction").vw.getHeight())));
views.get("pcoverflow").vw.setHeight((int)((views.get("svdaftarisi").vw.getTop()) - ((views.get("paction").vw.getTop() + views.get("paction").vw.getHeight()))));
views.get("ivsearch").vw.setLeft((int)(((100d / 100 * width)-((views.get("paction").vw.getHeight())/2.2d))-(4d / 100 * width)));
views.get("ivsearch").vw.setWidth((int)((views.get("paction").vw.getWidth())-(4d / 100 * width) - (((100d / 100 * width)-((views.get("paction").vw.getHeight())/2.2d))-(4d / 100 * width))));
views.get("ivsearch").vw.setTop((int)(0d));
views.get("ivsearch").vw.setHeight((int)((views.get("paction").vw.getHeight())/2.2d - (0d)));
views.get("ivsearch").vw.setTop((int)((views.get("paction").vw.getHeight())/2d - (views.get("ivsearch").vw.getHeight() / 2)));

}
}