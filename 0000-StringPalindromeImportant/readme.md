<div align="center">

  <!-- Minimalist Dynamic Header -->
  <img src="https://capsule-render.vercel.app/api?type=rect&color=timeGradient&height=200&section=header&text=Algorithms%20Laboratory&fontSize=45&fontColor=ffffff&animation=fadeIn&fontAlignY=40&desc=Design,%20Analysis,%20%26%20Experimental%20Validation&descAlignY=65&descAlign=50" width="100%"/>

  <!-- Dynamic Typing Subtitle -->
  <a href="https://git.io/typing-svg">
    <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=500&size=18&duration=4000&pause=1000&color=8B5CF6&center=true&vCenter=true&width=600&lines=Algorithms+%C2%B7+Experiments+%C2%B7+Asymptotic+Analysis;Reproducible+Visualizations+%C2%B7+C17+Implementations;Information+Technology+%C2%B7+IIIT+Bhubaneswar" alt="Typing SVG" />
  </a>

  <br/>

  <!-- High-Tech Flat Badges -->
  <p align="center">
    <img src="https://img.shields.io/badge/Language-C17-00599C?style=flat-square&logo=c&logoColor=white" />
    <img src="https://img.shields.io/badge/Modules-02_Active-7C3AED?style=flat-square" />
    <img src="https://img.shields.io/badge/Methodology-Theory_%2B_Experiment-22C55E?style=flat-square" />
    <img src="https://img.shields.io/badge/Status-Up_to_Date-F97316?style=flat-square" />
  </p>

</div>

---

### 👨‍💻 Scholar Details

> **Subham Mohanty** (B425050)
> **Branch:** Information Technology  
> **Institution:** International Institute of Information Technology, Bhubaneswar  
> **Course:** Design and Analysis of Algorithms Laboratory (3rd Semester)  
> **Instructor:** Dr. Ajaya Kumar Dash

---

### 🗂️ Laboratory Dashboard

<details open>
<summary><b>🧪 Lab 01: Algorithmic Foundations & Growth Rates</b> <i>(Click to collapse)</i></summary>
<br>

Six core experiments establishing the baseline for asymptotic analysis, basic recursion, and probability.

* **Q-1:** Functions ordered by increasing asymptotic growth
* **Q-2:** Fair vs. Biased coin probability simulations (`P → 0.5`)
* **Q-3:** Early-exit vs. Fixed-pass Bubble Sort experimental comparison
* **Q-4:** Towers of Hanoi exponential growth analysis (`2ⁿ − 1`)
* **Q-5:** Identifying the `0 → 1` transition point via Binary Search
* **Q-6:** Pairwise uniqueness checking (Quadratic worst-case growth)

👉 **[Explore Lab 01 Workspace](lab1/README.md)**
</details>

<details open>
<summary><b>🧱 Lab 02: Structural Trade-offs & Advanced Sorting</b> <i>(Click to collapse)</i></summary>
<br>

Deep dives into data structure representations, merging strategies, and theoretical vs. experimental validation.

* **Q-1 (Dictionary ADT):** Benchmarking 7 operations across 6 structures (`O(1)`, `O(log n)`, `O(n)`).
* **Q-2 (Merge Sort):** Interactive 2-way vs 3-way sort selector. Validated both as `Θ(n log n)`.
* **Q-3 (k-Array Merger):** Sequential accumulation (`Θ(nk²)`) vs. Balanced merging (`Θ(nk log k)`).

👉 **[Explore Lab 02 Workspace](lab2/README.md)**
</details>

---

### 🧬 Reproducibility & Research Philosophy

This repository strictly adheres to the principle of keeping the **algorithm**, the **measurement**, and the **visual evidence** tightly coupled.

| Core Standard | Implementation Strategy |
| :--- | :--- |
| **C-First Engineering** | All algorithmic foundations and experiments are written in raw `C17`. |
| **Theory Beside Evidence** | Every asymptotic conclusion (`Θ(n log n)`, `2ⁿ − 1`) is backed by measured data or step-by-step trace validation. |
| **Deterministic Data** | Fixed data generation pipelines are utilized wherever strict reproducibility matters. |
| **Automated Artifacts** | GNUPlot scripts and standalone C programs generate `.svg` and `.gif` artifacts directly from the source code. |

---

### 📂 Architecture & Build Workflow

```text
DAA-Lab/
├── README.md                      ← Global Dashboard
├── Makefile                       ← Root compilation directives
├── assets/                        ← Repository-wide visualizations
├── scripts/                       ← Utility & build helpers
│
├── lab1/                          ← Lab 01: Foundations
│   ├── README.md
│   ├── Problem-Sheet.pdf
│   └── Q-1/ to Q-6/               ← Isolated experiment modules
│
└── lab2/                          ← Lab 02: Structures & Trade-offs
    ├── README.md
    ├── assets/                    ← Animations (pipeline.gif, etc.)
    └── Q-1/ to Q-3/               ← Dictionary ops, n-way merges
