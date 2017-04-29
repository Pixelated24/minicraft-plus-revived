package minicraft.level.tile;

import minicraft.Game;
import minicraft.entity.Entity;
import minicraft.entity.ItemEntity;
import minicraft.entity.Mob;
import minicraft.entity.Player;
import minicraft.gfx.Color;
import minicraft.gfx.Screen;
import minicraft.item.Item;
import minicraft.item.ResourceItem;
import minicraft.item.ToolItem;
import minicraft.item.ToolType;
import minicraft.item.resource.Resource;
import minicraft.level.Level;

public class SandTile extends Tile {
	public SandTile(int id) {
		super(id);
		connectsToSand = true;
		maySpawn = true;
	}

	public static int col0 = Color.get(443, 440, 330, 440);
	public static int col00 = Color.get(440, 440, 330, 322);

	public static int col1 = Color.get(552, 550, 440, 440);
	public static int col11 = Color.get(440, 550, 440, 321);

	public static int col2 = Color.get(334, 330, 220, 220);
	public static int col22 = Color.get(330, 330, 220, 211);

	public static int col3 = Color.get(225, 220, 110, 110);
	public static int col33 = Color.get(220, 220, 110, 100);

	public void render(Screen screen, Level level, int x, int y) {
		if (Game.time == 0) {

			int col = col0;
			int transitionColor = col00;

			boolean u = !level.getTile(x, y - 1).connectsToSand;
			boolean d = !level.getTile(x, y + 1).connectsToSand;
			boolean l = !level.getTile(x - 1, y).connectsToSand;
			boolean r = !level.getTile(x + 1, y).connectsToSand;

			boolean steppedOn = level.getData(x, y) > 0;

			if (!u && !l) {
				if (!steppedOn) screen.render(x * 16 + 0, y * 16 + 0, 0, col, 0);
				else screen.render(x * 16 + 0, y * 16 + 0, 3 + 1 * 32, col, 0);
			} else
				screen.render(x * 16 + 0, y * 16 + 0, (l ? 11 : 12) + (u ? 0 : 1) * 32, transitionColor, 0);

			if (!u && !r) {
				screen.render(x * 16 + 8, y * 16 + 0, 1, col, 0);
			} else
				screen.render(x * 16 + 8, y * 16 + 0, (r ? 13 : 12) + (u ? 0 : 1) * 32, transitionColor, 0);

			if (!d && !l) {
				screen.render(x * 16 + 0, y * 16 + 8, 2, col, 0);
			} else
				screen.render(x * 16 + 0, y * 16 + 8, (l ? 11 : 12) + (d ? 2 : 1) * 32, transitionColor, 0);
			if (!d && !r) {
				if (!steppedOn) screen.render(x * 16 + 8, y * 16 + 8, 3, col, 0);
				else screen.render(x * 16 + 8, y * 16 + 8, 3 + 1 * 32, col, 0);

			} else
				screen.render(x * 16 + 8, y * 16 + 8, (r ? 13 : 12) + (d ? 2 : 1) * 32, transitionColor, 0);
		}
		if (Game.time == 1) {

			int col = col1;
			int transitionColor = col11;

			boolean u = !level.getTile(x, y - 1).connectsToSand;
			boolean d = !level.getTile(x, y + 1).connectsToSand;
			boolean l = !level.getTile(x - 1, y).connectsToSand;
			boolean r = !level.getTile(x + 1, y).connectsToSand;

			boolean steppedOn = level.getData(x, y) > 0;

			if (!u && !l) {
				if (!steppedOn) screen.render(x * 16 + 0, y * 16 + 0, 0, col, 0);
				else screen.render(x * 16 + 0, y * 16 + 0, 3 + 1 * 32, col, 0);
			} else
				screen.render(x * 16 + 0, y * 16 + 0, (l ? 11 : 12) + (u ? 0 : 1) * 32, transitionColor, 0);

			if (!u && !r) {
				screen.render(x * 16 + 8, y * 16 + 0, 1, col, 0);
			} else
				screen.render(x * 16 + 8, y * 16 + 0, (r ? 13 : 12) + (u ? 0 : 1) * 32, transitionColor, 0);

			if (!d && !l) {
				screen.render(x * 16 + 0, y * 16 + 8, 2, col, 0);
			} else
				screen.render(x * 16 + 0, y * 16 + 8, (l ? 11 : 12) + (d ? 2 : 1) * 32, transitionColor, 0);
			if (!d && !r) {
				if (!steppedOn) screen.render(x * 16 + 8, y * 16 + 8, 3, col, 0);
				else screen.render(x * 16 + 8, y * 16 + 8, 3 + 1 * 32, col, 0);

			} else
				screen.render(x * 16 + 8, y * 16 + 8, (r ? 13 : 12) + (d ? 2 : 1) * 32, transitionColor, 0);
		}
		if (Game.time == 2) {

			int col = col2;
			int transitionColor = col22;

			boolean u = !level.getTile(x, y - 1).connectsToSand;
			boolean d = !level.getTile(x, y + 1).connectsToSand;
			boolean l = !level.getTile(x - 1, y).connectsToSand;
			boolean r = !level.getTile(x + 1, y).connectsToSand;

			boolean steppedOn = level.getData(x, y) > 0;

			if (!u && !l) {
				if (!steppedOn) screen.render(x * 16 + 0, y * 16 + 0, 0, col, 0);
				else screen.render(x * 16 + 0, y * 16 + 0, 3 + 1 * 32, col, 0);
			} else
				screen.render(x * 16 + 0, y * 16 + 0, (l ? 11 : 12) + (u ? 0 : 1) * 32, transitionColor, 0);

			if (!u && !r) {
				screen.render(x * 16 + 8, y * 16 + 0, 1, col, 0);
			} else
				screen.render(x * 16 + 8, y * 16 + 0, (r ? 13 : 12) + (u ? 0 : 1) * 32, transitionColor, 0);

			if (!d && !l) {
				screen.render(x * 16 + 0, y * 16 + 8, 2, col, 0);
			} else
				screen.render(x * 16 + 0, y * 16 + 8, (l ? 11 : 12) + (d ? 2 : 1) * 32, transitionColor, 0);
			if (!d && !r) {
				if (!steppedOn) screen.render(x * 16 + 8, y * 16 + 8, 3, col, 0);
				else screen.render(x * 16 + 8, y * 16 + 8, 3 + 1 * 32, col, 0);

			} else
				screen.render(x * 16 + 8, y * 16 + 8, (r ? 13 : 12) + (d ? 2 : 1) * 32, transitionColor, 0);
		}
		if (Game.time == 3) {

			int col = col3;
			int transitionColor = col33;

			boolean u = !level.getTile(x, y - 1).connectsToSand;
			boolean d = !level.getTile(x, y + 1).connectsToSand;
			boolean l = !level.getTile(x - 1, y).connectsToSand;
			boolean r = !level.getTile(x + 1, y).connectsToSand;

			boolean steppedOn = level.getData(x, y) > 0;

			if (!u && !l) {
				if (!steppedOn) screen.render(x * 16 + 0, y * 16 + 0, 0, col, 0);
				else screen.render(x * 16 + 0, y * 16 + 0, 3 + 1 * 32, col, 0);
			} else
				screen.render(x * 16 + 0, y * 16 + 0, (l ? 11 : 12) + (u ? 0 : 1) * 32, transitionColor, 0);

			if (!u && !r) {
				screen.render(x * 16 + 8, y * 16 + 0, 1, col, 0);
			} else
				screen.render(x * 16 + 8, y * 16 + 0, (r ? 13 : 12) + (u ? 0 : 1) * 32, transitionColor, 0);

			if (!d && !l) {
				screen.render(x * 16 + 0, y * 16 + 8, 2, col, 0);
			} else
				screen.render(x * 16 + 0, y * 16 + 8, (l ? 11 : 12) + (d ? 2 : 1) * 32, transitionColor, 0);
			if (!d && !r) {
				if (!steppedOn) screen.render(x * 16 + 8, y * 16 + 8, 3, col, 0);
				else screen.render(x * 16 + 8, y * 16 + 8, 3 + 1 * 32, col, 0);

			} else
				screen.render(x * 16 + 8, y * 16 + 8, (r ? 13 : 12) + (d ? 2 : 1) * 32, transitionColor, 0);
		}
	}

	public void tick(Level level, int x, int y) {
		int d = level.getData(x, y);
		if (d > 0) level.setData(x, y, d - 1);
	}

	public void steppedOn(Level level, int x, int y, Entity entity) {
		if (entity instanceof Mob) {
			level.setData(x, y, 10);
		}
	}

	public boolean interact(Level level, int xt, int yt, Player player, Item item, int attackDir) {
		if (item instanceof ToolItem) {
			ToolItem tool = (ToolItem) item;
			if (tool.type == ToolType.shovel) {
				if (player.payStamina(4 - tool.level)) {
					level.setTile(xt, yt, Tile.dirt, 0);
					level.add(
							new ItemEntity(
									new ResourceItem(Resource.sand),
									xt * 16 + random.nextInt(10) + 3,
									yt * 16 + random.nextInt(10) + 3));
					return true;
				}
			}
			if (tool.type == ToolType.spade) {
				if (player.payStamina(5 - tool.level)) {
					level.setTile(xt, yt, Tile.dirt, 0);
					level.add(
							new ItemEntity(
									new ResourceItem(Resource.sand),
									xt * 16 + random.nextInt(10) + 3,
									yt * 16 + random.nextInt(10) + 3));
					return true;
				}
			}
		}
		return false;
	}
}