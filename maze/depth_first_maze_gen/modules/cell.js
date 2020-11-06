function removeWalls(current, next) {
    var xdiff = current.row - next.row;
    if (xdiff === 1) {
        current.west = false;
        next.east = false;
    } else if (xdiff === -1) {
        current.east = false;
        next.west = false;
    }
    var ydiff = current.col - next.col;
    if (ydiff === 1) {
        current.south = false;
        next.north = false;
    } else if (ydiff === -1) {
        current.north = false;
        next.south = false;
    }
}

function index(row, col) {
    if (row < 0 || col < 0 || col >= dfs.cols || row >= dfs.rows) {
        return -1;
    }
    return row * rows + col;
}

function index(row, col) {
    if (row < 0 || col < 0 || col >= dfs.cols || row >= dfs.rows) {
        return -1;
    }
    return row * dfs.rows + col;
}

function cell(row, col) {
    this.row = row;
    this.col = col;
    this.north = true;
    this.south = true;
    this.west = true;
    this.east = true;
    this.visited = false;

    this.highlight = () => {
        var x = this.row * dfs.mapHeight;
        var y = this.col * dfs.mapWidth;
        dfs.noStroke();
        dfs.fill('white');
        dfs.rect(x, y, dfs.mapWidth, dfs.mapHeight);
    }

    this.show = () => {
        var x = this.row * dfs.mapHeight;
        var y = this.col * dfs.mapWidth;
        dfs.stroke(255);
        if (this.north) {
            dfs.line(x, y + dfs.mapHeight, x + dfs.mapWidth, y + dfs.mapHeight);
        }
        if (this.south) {
            dfs.line(x, y, x + dfs.mapWidth, y);
        }
        if (this.west) {
            dfs.line(x, y, x, y + dfs.mapHeight);
        }
        if (this.east) {
            dfs.line(x + dfs.mapWidth, y, x + dfs.mapWidth, y + dfs.mapHeight);
        }
        if (this.visited) {
            dfs.noStroke();
            dfs.fill(255, 0, 255, 100);
            dfs.rect(x, y, dfs.mapWidth, dfs.mapHeight);
        }
    }

    this.getRandomNeighbor = () => {
        var neighbors = []
        var north = dfs.grid[index(this.row - 1, this.col)];
        var south = dfs.grid[index(this.row + 1, this.col)];
        var west = dfs.grid[index(this.row, this.col - 1)];
        var east = dfs.grid[index(this.row, this.col + 1)];
        if (north && !north.visited) {
            neighbors.push(north);
        }
        if (south && !south.visited) {
            neighbors.push(south);
        }
        if (west && !west.visited) {
            neighbors.push(west);
        }
        if (east && !east.visited) {
            neighbors.push(east);
        }
        if (neighbors.length > 0) {
            r = dfs.floor(dfs.random(0, neighbors.length));
            return neighbors[r];
        }
        return undefined;
    }
}