import express from "express";

const app = express();
const env = process.env;

const PORT = env.PORT || 3002;

app.get("/api/status", (req, res) => {
  res.status(200).json({ message: "working!", statusCode: 200 });
});

app.listen(PORT, () =>
  console.info(`sales-api: http://localhost:${PORT}/api/status`)
);
