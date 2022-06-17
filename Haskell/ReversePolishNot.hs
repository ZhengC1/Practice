solveRPN :: (Num a, Read a) => String  -> [a]
solveRPN  = foldl func [] . words
    where   func (x:y:xs) "*" = (x * y):xs
            func (x:y:xs) "-" = (x - y):xs
            func (x:y:xs) "+" = (x + y):xs
            func xs numString = read numString:xs

main = do
       print $ solveRPN "10 4 3 + 2 * -"
