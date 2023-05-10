
const regex2 = /<comment\s*\b(.*?)\b\s*>(.*?)<\/comment>/;
const pattern2 = new RegExp(regex2);
const matcher2 = pattern2.exec(attachmentContent1);
console.log(matcher2);
//[
//  '<comment>Tsuyoshi.</comment>',
//  '',
//  'Tsuyoshi.',
//  index: 33,
//  input: '<html><body><h1>Hello World!</h1><comment>Tsuyoshi.</comment><h1>This is a paragraph.</h1></body></html>',
//  groups: undefined
//]

const content = '<html><body><h1>Hello World!</h1><s3 comment>Tsuyoshi.</s3 comment><h1>This is a paragraph.</h1></body></html>';
const extractComment3 = (attachmentContent) => {
    const reg = /<comment\s*\b(.*?)\b\s*>(.*?)<\/comment>/;
    const pat = new RegExp(regex2);
    const matc = pat.exec(attachmentContent);
    if (matc != null) {
        let substring = matc[2];
        console.log(substring);
    } else {
        console.log("No match!");
    }
}


