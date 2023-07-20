import express from "express"

const app = express();
const env = process.env

const PORT = env.PORT || 8080

app.get("/api/status", (req, res) => {
    res.status(200).json({
        message: "status ok",
        httpStatus: 200
    })
})
app.listen(PORT, () => console.info(`server starter with success: http://localhost:${PORT}/`))