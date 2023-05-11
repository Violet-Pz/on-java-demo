class ForEach {
    const obj = {a:1, b:2, c:{i:1, ii:2, iii:3}, d:4};
    const result1 = [];
    obj.c.forEach(element => {
        result1.push({ a: obj.a, c: element });
    });

    console.log(result1[1].c);
    // {ii: 2}
    console.log(result1[2]);
    // {a:1, c:{iii:3}}
}