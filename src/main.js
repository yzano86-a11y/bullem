import "./style.css";

const games=[{name:"طرنيب",icon:"🃏",status:"قريباً"},{name:"بلوت",icon:"♠️",status:"قريباً"},{name:"تركس",icon:"♦️",status:"قريباً"},{name:"هاند",icon:"♥️",status:"قريباً"}];

document.querySelector("#app").innerHTML=`
<header class="top"><div class="brand">👑 <span>الملوك</span></div><button class="login">دخول</button></header>
<main>
<section class="hero"><div><p class="eyebrow">مملكة الألعاب</p><h1>أهلاً بك في <strong>الملوك</strong></h1><p>منصة ألعاب اجتماعية جديدة، نبنيها من الصفر لتكون سريعة، جميلة، ومصممة للعب الجماعي.</p><button class="primary">ابدأ اللعب</button></div><div class="crown">♛</div></section>
<section><div class="section-title"><h2>الألعاب</h2><span>قريباً المزيد</span></div><div class="games">${games.map(g=>`<article class="game"><div class="game-icon">${g.icon}</div><h3>${g.name}</h3><span>${g.status}</span></article>`).join("")}</div></section>
</main>
<footer>الملوك © 2026</footer>`;
