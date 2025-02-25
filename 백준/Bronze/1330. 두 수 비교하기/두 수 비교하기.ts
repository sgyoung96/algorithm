import * as fs from 'fs';

const input: string = fs.readFileSync('/dev/stdin', 'utf8').trim();
const lines: string[] = input.split('\n');

const [A, B] = lines[0].split(' ').map(Number);

if (A > B) {
    console.log('>')
} else if (A < B) {
    console.log('<');
} else {
    console.log('==');
}