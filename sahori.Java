const heartShape = new THREE. Shape();
heartShape.moveTo(0, -8.6); heartShape.bezierCurveTo(-1.7, -6.6, -8.5, -2.9, -8.8, 2.8); heartShape.bezierCurveTo(-9.1, 8.0, -3.5, 10.0, 0, 5.8);

function outlineHeartPoint(t, scale = 0.72) {

const x = 16 Math.pow(Math.sin(t), 3);

const p = new THREE. Vector2(x scale 0.98, y scale 0.9 0.8)

const lower = THREE.MathUtils.clamp((-4.0 p.y) / 5.6, 0, 1);

p.x = 1 lower 0.1;

p.y += lower 0.34 + notch 0.48;

return p;}
