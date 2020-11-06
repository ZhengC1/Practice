var sketch;
var depthFirstSearch = (dfs) => {
    dfs.rows;
    dfs.cols;
    dfs.mapWidth = 20;
    dfs.mapHeight = 20;
    dfs.grid = [];
    dfs.stack = [];
    dfs.current;

    dfs.setup = () => {
        dfs.createCanvas(400, 400);
        dfs.rows = dfs.floor(dfs.width / dfs.mapHeight);
        dfs.cols = dfs.floor(dfs.height / dfs.mapWidth);
        dfs.frameRate(12);
        for (var row = 0; row < dfs.rows; row++) {
            for (var col = 0; col < dfs.cols; col++) {
                dfs.grid.push(new cell(row, col));
            }
        }
        dfs.current = dfs.grid[0];
        dfs.stack.push(dfs.current);
    }


    dfs.draw = () => {
        dfs.background(51);
        dfs.current.visited = true;
        dfs.current.highlight();
        dfs.grid.map(x => x.show());
        var next = dfs.current.getRandomNeighbor();
        if (next) {
            dfs.stack.push(dfs.current);
            removeWalls(dfs.current, next);
            dfs.current = next;
        } else if (dfs.stack.length > 0) {
            dfs.current = dfs.stack.pop();
        }
    }
}

const displayDepthFirst = () => {
    sketch = new p5(depthFirstSearch);
}