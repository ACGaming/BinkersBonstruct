package slimeknights.tconstruct.library.client;

import java.util.List;
import javax.annotation.Nonnull;

import com.google.common.collect.Lists;
import org.lwjgl.util.Point;
import net.minecraft.item.ItemStack;

import slimeknights.tconstruct.library.tinkering.TinkersItem;

public class ToolBuildGuiInfo
{

    public static ToolBuildGuiInfo default3Part(@Nonnull TinkersItem tool)
    {
        ToolBuildGuiInfo info = new ToolBuildGuiInfo(tool);
        info.addSlotPosition(33 - 20, 42 + 20);
        info.addSlotPosition(33 + 20, 42 - 20);
        info.addSlotPosition(33, 42);
        return info;
    }

    @Nonnull
    public final ItemStack tool;
    // the positions where the slots are located
    public final List<Point> positions = Lists.newArrayList();

    public ToolBuildGuiInfo()
    {
        // for repairing
        this.tool = ItemStack.EMPTY;
    }

    public ToolBuildGuiInfo(@Nonnull TinkersItem tool)
    {
        this.tool = tool.buildItemForRenderingInGui();
    }

    /**
     * Add another slot at the specified position for the tool.
     * The positions are usually located between:
     * X: 7 - 69
     * Y: 18 - 64
     */
    public void addSlotPosition(int x, int y)
    {
        positions.add(new Point(x, y));
    }

}
