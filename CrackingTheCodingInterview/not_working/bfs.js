const mapGenerator = size => {
    var arr = []
    for(let i = 0; i < size; i++) {
        var row = [];
        for(let j = 0; j < size; j++) {
            row.push(Math.round(Math.random()));
        }
        arr.push(row);
    }
    arr[0][0] = -1;
    arr[arr.length -1][arr.length -1] = -1;
    return arr;
}


const visitedBool = size => {
    var arr =[];
    for(let i = 0; i < size; i++) {
        var row = [];
        for(let j = 0; j < size; j++) {
            row.push(false);
        }
        arr.push(row);
    }
    return arr;
}


const size = 5;
let map = mapGenerator(size);
let visited = visitedBool(size);

const bfs = (map, visited) => {
    var queue = [this];
    var start;
    while queue.length > 0) {
        start = queue.shift();
        if (!n.left || !n.right) {
            continue;
        }
        for (var i = 0; i < n.
    }

}
