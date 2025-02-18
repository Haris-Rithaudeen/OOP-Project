package io.github.inf1009.manager;

import io.github.inf1009.Block;
import io.github.inf1009.Grid;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class MovementManager {
//    public static void updateBlock(Block block, Grid grid, float delta) {
//        if (!block.leftCollision()) {
//            block.move(-1, 0);
//        }
//        if (Gdx.input.isKeyJustPressed(Input.Keys.RIGHT) && !block.rightCollision()) {
//            block.move(1, 0);
//        }
//        if (Gdx.input.isKeyJustPressed(Input.Keys.DOWN) && !block.bottomCollision(grid)) { // ✅ Pass grid here
//            block.move(0, -1);
//        }
//    }

    private Block block;
    private Grid grid;

    public MovementManager(Block block, Grid grid) {
        this.block = block;
        this.grid = grid;
    }

    public void moveLeft() {
        if (!block.leftCollision()) {
            block.move(-1, 0);
        }
    }

    public void moveRight() {
        if (!block.rightCollision()) {
            block.move(1, 0);
        }
    }

    public void moveDown() {
        if (!block.bottomCollision(grid)) {
            block.move(0, -1);
        }
    }

    public void setBlock(Block block) {
        this.block = block;
    }
}
